import sys
import os
import shutil
import subprocess
import re

'''
Set up directories and then compare stack limits
'''
def run():
	if (len(sys.argv)!=5):
		print "Wrong number of arguments"
		sys.exit(-1)

	# get paths
	joos_compiler = sys.argv[1]
	joos_libs = sys.argv[2]
	testing_dir = sys.argv[3]
	joos_aplus_compiler = sys.argv[4]

	# set up directories
	current_folders = os.listdir(testing_dir)

	if "group_h_output" in current_folders:
		shutil.rmtree(testing_dir + "group_h_output/")
	os.mkdir(testing_dir + "group_h_output/")

	if "joos_aplus_output" in current_folders:
		shutil.rmtree(testing_dir + "joos_aplus_output/")
	os.mkdir(testing_dir + "joos_aplus_output/")

	# copy test cases
	for filee in os.listdir(testing_dir+"test_cases/"):
		shutil.copy(testing_dir+"test_cases/"+filee, testing_dir+"group_h_output/"+filee)
		shutil.copy(testing_dir+"test_cases/"+filee, testing_dir+"joos_aplus_output/"+filee)

	# run a+ compiler on test cases
	for filee in os.listdir(testing_dir+"joos_aplus_output/"):
		try:
			subprocess.call([joos_aplus_compiler,testing_dir+"joos_aplus_output/"+filee])
		except Exception:
			print "joosa+ compiler crashed. File " + filee

	# run our compiler on test cases
	for filee in os.listdir(testing_dir+"group_h_output/"):
		try:
			subprocess.call([joos_compiler,joos_libs + "appletlib.joos",joos_libs + "awtlib.joos", joos_libs + "BigDecimal.joos", joos_libs + "javalib.joos", joos_libs + "jooslib.joos", joos_libs + "netlib.joos",testing_dir+"group_h_output/"+filee])
		except Exception:
			print "Group-h's compiler crashed. File " + filee

	# compare the output
	compareOutput(testing_dir + "group_h_output/", testing_dir+"joos_aplus_output/")

	# clean up before leaving
	cleanUp(testing_dir + "group_h_output/", testing_dir+"joos_aplus_output/")

'''
Compare the output generated by our compiler and that by the a-plus compiler
'''
def compareOutput(grouph, aplus):
	print
	for filee in os.listdir(grouph):
		if (filee.endswith(".j")):
			print filee.replace(".j", "")
			print
			ghList = getStackLimit(grouph+filee)
			apList = getStackLimit(aplus+filee)
			printComparison(ghList, apList)
			print

'''
Print tables for each test case illustrating the stack limit comparisons
'''
def printComparison(ghList, apList):
	print "Stack Limit Values:\n"
	print "-----------------------"
	print "Group-h\t|\tA+"
	print "-----------------------"
	for i in range(0,len(ghList)):
		print re.findall(r"[0-9]+",ghList[i])[0],
		print "\t|\t",
		print re.findall(r"[0-9]+",apList[i])[0]

'''
Gets the stack limit values from a file and returns it as a list
'''
def getStackLimit(filepath):
	f = open(filepath)
	lines = f.readlines()
	f.close
	returnList = []
	for line in lines:
		if (re.match(r"\s*[.]limit stack [0-9]+",line)):
			returnList.append(line)
	return returnList

'''
Remove the directories created for testing
'''
def cleanUp(grouph,aplus):
	shutil.rmtree(grouph)
	shutil.rmtree(aplus)

if __name__=="__main__":
		run()

