/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import wig.analysis.*;

@SuppressWarnings("nls")
public final class TReceive extends Token
{
    public TReceive()
    {
        super.setText("receive");
    }

    public TReceive(int line, int pos)
    {
        super.setText("receive");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReceive(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReceive(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReceive text.");
    }
}
