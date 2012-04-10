package model;


import java.util.ArrayList;

public  class LoadDAO {
    private static LoadDAO loadDAO = new LoadDAO();
    private Loads loadsDB = new Loads();

    private LoadDAO(){

    }

    public void registerLoad( String content, String harbor){
        loadsDB.registerLoad(content, harbor);
    }

    public ArrayList<Load> getLoadsDB(){
            return loadsDB.getLoads();
    }

    public ArrayList<Load> getLoads(String s){
        if(!s.equals("")){
            ArrayList<Load> loadsMatching = new ArrayList<Load>();
            for(Load load: loadsDB.getLoads())
                if(s.equals(load.getHarbor()))
                    loadsMatching.add(load);
            return loadsMatching;
        }
        else
            return loadsDB.getLoads();
    }

    public static LoadDAO getInstance(){
        return loadDAO;
    }


}
