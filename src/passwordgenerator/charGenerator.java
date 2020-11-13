package passwordgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class charGenerator {
     private final List<Integer> range = new ArrayList<>();

      charGenerator()
    {
        this.addRange(new int[]{0});
    }
     
    charGenerator(int[] arr)
    {
        this.addRange(arr);
    }

    final void addRange(int arr[])
    {
        for(int i :arr)
        {
            this.range.add(i);
        }
    }

    int getRandom()
    {
        return this.range.get(new Random().nextInt(this.range.size()));
    }
    
    void Clear(){
        range.clear();
    }
    
}
