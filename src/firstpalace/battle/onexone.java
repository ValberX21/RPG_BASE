package firstpalace.battle;

import firstpalace.interfaces.Battle;

import java.util.HashMap;

public class onexone implements Battle {

    @Override
    public String oneone(HashMap p1, HashMap p2){

        int p1Attack = Integer.parseInt(p1.values().iterator().next().toString());
        int p2Attack = Integer.parseInt(p2.values().iterator().next().toString());

        if(p1Attack > p2Attack)
        {
            return p1.keySet().iterator().next().toString().toString() + " WIN !!!!!!";
        }
        else
        {
            return p2.keySet().iterator().next().toString().toString() + " WIN !!!!!!";
        }
    }

}
