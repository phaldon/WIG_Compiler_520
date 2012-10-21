package wig.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import wig.lexer.Lexer;
import wig.node.Start;
import wig.parser.Parser;
import wig.prettyprinter.PrettyPrinter;

public class Compiler
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            File inputFile = new File("simple_example.wig");
            FileReader inputReader = new FileReader(inputFile);
            
            Parser p = 
                    new Parser (
                      new Lexer (
                         new PushbackReader(inputReader, 1024)));
                 
            Start tree = p.parse();
            
            PrettyPrinter.print(tree);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}