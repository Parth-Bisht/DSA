import java.util.ArrayList;

/*
Dr. Strange has n distinct integers from 1 to n. He uses his mind power and time stone to calculate all the possible
subsets using the given n integers. Generate all the possible subsets.
Elements within the set must be in non-decreasing order. All the subsets must be distinct and sorted in ascending
order or lexicographically. For an empty subset just print a blank line.

Sample Input: 3

Sample Output:

1
1 2
1 2 3
1 3
2
2 3
 */
public class Main {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> strs = new ArrayList<>();
        for(int i=1;i<=3;i++){
            strs.add(i);
        }
        strange(strs,new ArrayList<>(),0);
    }

    public static void strange(ArrayList<Integer> strs,ArrayList<Integer> tempStr,int index){
        if(tempStr.size()>=0) {
            StringBuilder result = new StringBuilder();
            for(int i=0;i<tempStr.size();i++){
                result.append(tempStr.get(i));
                if(i<tempStr.size()-1){
                    result.append(" ");
                }
            }
            System.out.println(result.toString());
        }
        if(index==strs.size()) return;
        for(int i=index;i<strs.size();i++){
            tempStr.add(strs.get(i));
            strange(strs,tempStr,i+1);
            tempStr.remove(tempStr.size()-1);
        }
    }
}