/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import java.util.*;
import wig.analysis.*;

@SuppressWarnings("nls")
public final class AService extends PService
{
    private final LinkedList<PHtml> _html_ = new LinkedList<PHtml>();
    private final LinkedList<PSchema> _schema_ = new LinkedList<PSchema>();
    private final LinkedList<PVariable> _variable_ = new LinkedList<PVariable>();
    private final LinkedList<PFunction> _function_ = new LinkedList<PFunction>();
    private final LinkedList<PSession> _session_ = new LinkedList<PSession>();

    public AService()
    {
        // Constructor
    }

    public AService(
        @SuppressWarnings("hiding") List<?> _html_,
        @SuppressWarnings("hiding") List<?> _schema_,
        @SuppressWarnings("hiding") List<?> _variable_,
        @SuppressWarnings("hiding") List<?> _function_,
        @SuppressWarnings("hiding") List<?> _session_)
    {
        // Constructor
        setHtml(_html_);

        setSchema(_schema_);

        setVariable(_variable_);

        setFunction(_function_);

        setSession(_session_);

    }

    @Override
    public Object clone()
    {
        return new AService(
            cloneList(this._html_),
            cloneList(this._schema_),
            cloneList(this._variable_),
            cloneList(this._function_),
            cloneList(this._session_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAService(this);
    }

    public LinkedList<PHtml> getHtml()
    {
        return this._html_;
    }

    public void setHtml(List<?> list)
    {
        for(PHtml e : this._html_)
        {
            e.parent(null);
        }
        this._html_.clear();

        for(Object obj_e : list)
        {
            PHtml e = (PHtml) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._html_.add(e);
        }
    }

    public LinkedList<PSchema> getSchema()
    {
        return this._schema_;
    }

    public void setSchema(List<?> list)
    {
        for(PSchema e : this._schema_)
        {
            e.parent(null);
        }
        this._schema_.clear();

        for(Object obj_e : list)
        {
            PSchema e = (PSchema) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._schema_.add(e);
        }
    }

    public LinkedList<PVariable> getVariable()
    {
        return this._variable_;
    }

    public void setVariable(List<?> list)
    {
        for(PVariable e : this._variable_)
        {
            e.parent(null);
        }
        this._variable_.clear();

        for(Object obj_e : list)
        {
            PVariable e = (PVariable) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._variable_.add(e);
        }
    }

    public LinkedList<PFunction> getFunction()
    {
        return this._function_;
    }

    public void setFunction(List<?> list)
    {
        for(PFunction e : this._function_)
        {
            e.parent(null);
        }
        this._function_.clear();

        for(Object obj_e : list)
        {
            PFunction e = (PFunction) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._function_.add(e);
        }
    }

    public LinkedList<PSession> getSession()
    {
        return this._session_;
    }

    public void setSession(List<?> list)
    {
        for(PSession e : this._session_)
        {
            e.parent(null);
        }
        this._session_.clear();

        for(Object obj_e : list)
        {
            PSession e = (PSession) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._session_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._html_)
            + toString(this._schema_)
            + toString(this._variable_)
            + toString(this._function_)
            + toString(this._session_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._html_.remove(child))
        {
            return;
        }

        if(this._schema_.remove(child))
        {
            return;
        }

        if(this._variable_.remove(child))
        {
            return;
        }

        if(this._function_.remove(child))
        {
            return;
        }

        if(this._session_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PHtml> i = this._html_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PHtml) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PSchema> i = this._schema_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSchema) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PVariable> i = this._variable_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVariable) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PFunction> i = this._function_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFunction) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PSession> i = this._session_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSession) newChild);
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
