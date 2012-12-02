/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import java.util.*;
import wig.analysis.*;

@SuppressWarnings("nls")
public final class ACallExp extends PExp
{
    private TIdentifier _identifier_;
    private final LinkedList<PExp> _exp_ = new LinkedList<PExp>();

    public ACallExp()
    {
        // Constructor
    }

    public ACallExp(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<?> _exp_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ACallExp(
            cloneNode(this._identifier_),
            cloneList(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACallExp(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PExp> getExp()
    {
        return this._exp_;
    }

    public void setExp(List<?> list)
    {
        for(PExp e : this._exp_)
        {
            e.parent(null);
        }
        this._exp_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._exp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PExp> i = this._exp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
