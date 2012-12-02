/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import java.util.*;
import wig.analysis.*;

@SuppressWarnings("nls")
public final class AFunction extends PFunction
{
    private PType _type_;
    private TIdentifier _identifier_;
    private final LinkedList<PArgument> _argument_ = new LinkedList<PArgument>();
    private PCompoundstm _compoundstm_;

    public AFunction()
    {
        // Constructor
    }

    public AFunction(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<?> _argument_,
        @SuppressWarnings("hiding") PCompoundstm _compoundstm_)
    {
        // Constructor
        setType(_type_);

        setIdentifier(_identifier_);

        setArgument(_argument_);

        setCompoundstm(_compoundstm_);

    }

    @Override
    public Object clone()
    {
        return new AFunction(
            cloneNode(this._type_),
            cloneNode(this._identifier_),
            cloneList(this._argument_),
            cloneNode(this._compoundstm_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunction(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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

    public LinkedList<PArgument> getArgument()
    {
        return this._argument_;
    }

    public void setArgument(List<?> list)
    {
        for(PArgument e : this._argument_)
        {
            e.parent(null);
        }
        this._argument_.clear();

        for(Object obj_e : list)
        {
            PArgument e = (PArgument) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._argument_.add(e);
        }
    }

    public PCompoundstm getCompoundstm()
    {
        return this._compoundstm_;
    }

    public void setCompoundstm(PCompoundstm node)
    {
        if(this._compoundstm_ != null)
        {
            this._compoundstm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._compoundstm_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._identifier_)
            + toString(this._argument_)
            + toString(this._compoundstm_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._argument_.remove(child))
        {
            return;
        }

        if(this._compoundstm_ == child)
        {
            this._compoundstm_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PArgument> i = this._argument_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PArgument) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._compoundstm_ == oldChild)
        {
            setCompoundstm((PCompoundstm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
