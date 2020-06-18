package peopleSerialization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PeopleList {

    List<People> peopleList = new ArrayList<>();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(People peopleList) {
        this.peopleList.add(peopleList);
    }

    public void peopleMaker () {
        for(int i = 0; i< 2; i++) {
            try {
                System.out.println("Please enter: Name SurName and age");
                System.out.println("Example: Ryan Reynolds 43");
                String peopleData = bf.readLine();
                setPeopleList(new People(peopleData.split(" ")[0], peopleData.split(" ")[1],
                        Integer.parseInt(peopleData.split(" ")[2])));
            } catch (Exception e)
            {
                ;
            }
        }
    }
}
