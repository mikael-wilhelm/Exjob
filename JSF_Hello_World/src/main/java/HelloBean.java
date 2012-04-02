import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {




    int number = 5;
    private boolean vis = false;
    private static final long serialVersionUID = 1L;

    public ArrayList<Integer> getNumbers()
    {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers)
    {
        this.numbers = numbers;
    }

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    private String name;

    public boolean isVis()
    {
        return vis;
    }

    public void setVis(boolean vis)
    {
        this.vis = vis;
    }


    public void test()
    {
        numbers.add(5);
        numbers.add(2);
        vis = !vis;
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
