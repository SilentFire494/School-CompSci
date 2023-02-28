

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TextParsc 
{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("C:\\Users\\s82735\\OneDrive - Park Hill School District\\Desktop\\School CompSci\\FakeFribbles2\\src\\Test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null)
        {
            //System.out.println(st);

            // check for if it is a weapon
            if (st.contains("Weapon"))
            {
                //System.out.println("Weapon found");
                Weapon weapon = new Weapon();

                // get the name of the weapon
                if (st.contains("name:"))
                {
                    String name = st.substring(6);
                    weapon.setName(name);
                }

                // get the stats of the weapon
                if 




            }
        }

        br.close();
    }
}