package pl.akademiakodu;

/**
 * Created by lukasz on 2017-07-17.
 */
public class Table {
    //enkapsulacja //hermetyzacja
    private int legs;
 private int height;
 private int area;

 private String tableinfo;

 public Table(int startLegs, int startHeight, int startArea){
     legs=startLegs;
     height=startHeight;
     area=startArea;

     tableinfo= legs+" : "+height+" : "+area;

 }

 //powtarzamy sie -- ¿le
    //U¿ywamy this , odnosz±c sie do konstruktora matki (konstruktor ,ktry ma najwiêcej argumentow
    public Table( int startHeight, int startArea){
       this(0,startHeight,startArea);  // konstruktor nadrzeny z najwiêksz± iloscia argumentow

    }
    public Table( int legs,int startHeight, int startArea,String color){
        this(0,startHeight,startArea);

    }


 public int getLegs(){
     return legs;
 }
 //gettery
    public int getHeight(){
        return height;
    }
    public int getArea(){
        return area;
    }
    public String getTableinfo(){
        return  tableinfo;
    }

    //settery ustawiaj± nowa wartosc
 public void setLegs(int startLegs){
        legs=startLegs;
 }
    public void setArea(int startArea){
        area=startArea;
    }
    public void setHeight(int startHeight){
        height=startHeight;
    }

    public int getVolume(){
        return height + area;
    }


    public void makeVoice(){
        System.out.println("Zgrzyyyyyyyt");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (legs != table.legs) return false;
        if (height != table.height) return false;
        if (area != table.area) return false;
        return tableinfo != null ? tableinfo.equals(table.tableinfo) : table.tableinfo == null;
    }

    @Override
    public int hashCode() {
        int result = legs;
        result = 31 * result + height;
        result = 31 * result + area;
        result = 31 * result + (tableinfo != null ? tableinfo.hashCode() : 0);
        return result;
    }
}
