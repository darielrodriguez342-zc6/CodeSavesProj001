import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    //PT1 arraylist
    @SuppressWarnings("unchecked")
    public static  <T>ArrayList<Number> createArr(double size)
    {
        ArrayList<Number> createdArr = new ArrayList<>();
        for(int i = 0; i < size; i++){
           createdArr.add(Math.random()*10);
        }
       return createdArr;
    }


    public static void main(String[] args){
        //for the first objective
        ArrayList<Number> randArr = new ArrayList<>();
        int rInt = (int) (Math.random() * 10);
        randArr = createArr(rInt);
        float fVar = 10.23f;
        double dVar = 10.50;
        int iVar = 10;
        randArr.add(fVar);
        randArr.add(dVar);
        randArr.add(iVar);
        //System.out.println(randArr);
        //System.out.println(randArr.indexOf(dVar));

        //Create generic containers
        GenericContainer<Character> characters = new GenericContainer<>();
        GenericContainer<Gym> gyms = new GenericContainer<>();
        GenericContainer<Circuit> circuits = new GenericContainer<>();

        //Add objects into container
        Character ippo = new Character("Ippo Makunouchi","Kamogawa Boxing Gym",1,0);
        Character takamura = new Character("Mamoru Takamura","Kamogawa Boxing Gym",8,0);
        Character aoki = new Character("Masaru Aoki","Kamogawa Boxing Gym",8,4);
        Character kimura = new Character("Tatsuya Kimura","Kamogawa Boxing Gym",7,3);
        Gym kamogawaGym = new Gym("Kamogawa Boxing Gym","Tokyo, Japan", 10);


        Circuit rookieKing = new Circuit("East Japan Rookie King Tournament","1990",1000);

        characters.add(ippo);
        characters.add(takamura);
        characters.add(aoki);
        characters.add(kimura);
        gyms.add(kamogawaGym);
        circuits.add(rookieKing);

        Character jason = new Character("Jason Ozuma","Hachinohe Boxing Club",3,0);
        Gym hachinoheBoxing = new Gym("Hachinohe Boxing Club","Aomori, Japan", 6);
        characters.add(jason);
        gyms.add(hachinoheBoxing);

        Character miyata = new Character("Ichirō Miyata","Tōhō Boxing Gym",3,0);
        Gym kawaharaGym = new Gym("Kawahara Boxing Gym","Tokyo, Japan", 5);
        characters.add(miyata);
        gyms.add(kawaharaGym);

        Character ryo = new Character("Ryō Mashiba","Tōhō Boxing Gym",3,0);
        Gym tohoGym = new Gym("Tōhō Boxing Gym","Tokyo, Japan", 10);
        characters.add(ryo);
        gyms.add(tohoGym);

        //showing the container is functional
        characters.remove(miyata);
        System.out.println(characters.toString());
        characters.add(miyata);
        System.out.println(characters.toString());
        characters.get(4);
        System.out.println(characters.size());
        System.out.println(characters.toString());

    }
}
