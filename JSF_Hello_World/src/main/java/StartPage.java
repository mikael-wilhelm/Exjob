import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class StartPage implements Serializable {



    ArrayList<Load> loads = new ArrayList<Load>();
    private String name;
    int number = 5;
    private boolean vis = true;
    private int tempLoadNumber;
    private String tempLoadName ="";
    private static final long serialVersionUID = 1L;

    public void test()
    {
        loads.add(new Load(tempLoadNumber,tempLoadName ));
    }











    public String getTempLoadName()
    {
        return tempLoadName;
    }

    public int getTempLoadNumber()
    {
        return tempLoadNumber;
    }

    public void setTempLoadNumber(int tempLoadNumber)
    {
        this.tempLoadNumber = tempLoadNumber;
    }

    public void setTempLoadName(String tempLoadName)
    {
        this.tempLoadName = tempLoadName;
    }

    public ArrayList<Load> getLoads()
    {
        return loads;
    }

    public void setLoads(ArrayList<Load> loads)
    {
        this.loads = loads;
    }


    public boolean isVis()
    {
        return vis;
    }

    public void setVis(boolean vis)
    {
        this.vis = vis;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }



}
