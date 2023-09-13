import java.util.ArrayList;

/*
Dr. Strange is back again and this time he has an array A with n integers which may have duplicates.
So he again uses his mind power and time stone to calculate all the possible subsets of the input array A.
Generate all the possible subsets.

sample input:
3
1 2 2

sample output:

1
1 2
1 2 2
2
2 2
 */
public class Main {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        strangeII(arr,new ArrayList<>(),0);
    }

    public static void strangeII(ArrayList<Integer> arr,ArrayList<Integer> tempArr, int index){
        if(tempArr.size()>=0){
            StringBuilder result = new StringBuilder();
            for(int i=0;i<tempArr.size();i++){
                result.append(tempArr.get(i));
                if(i<tempArr.size()-1){
                    result.append(" ");
                }
            }
            System.out.println(result.toString());
        }
        if(index==arr.size()) return;
        for(int i=index;i<arr.size();i++){
            tempArr.add(arr.get(i));
            strangeII(arr,tempArr,i+1);
            tempArr.remove(tempArr.size()-1);
        }
    }
}