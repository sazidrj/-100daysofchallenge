/*
This problem was asked by Airbnb.

        We're given a hashmap associating each courseIdkey with a list of courseIdsvalues, which
        represents that the prerequisites of courseId are courseIds. Return a sorted ordering of courses
        such that we can finish all courses.
        Return null if there is no such ordering.
        For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}, should return
        ['CSC100', 'CSC200', 'CSCS300'].


 */
import java.util.*;
import java.io.*;
public class day48_solution {
    public static List<String> sort(Map<String, Set<String>> map){
        Set<String> visited = new HashSet<>();
        List<String> res = new ArrayList<>();
        for(String courseId : map.keySet())
            dfs(courseId,map,visited,res);
     return res;
    }

    private static void dfs(String courseId, Map<String, Set<String>> map, Set<String> visited, List<String> res){
       if(visited.contains(courseId))
           return;

       visited.add(courseId);

       for(String id:map.getOrDefault(courseId, Collections.emptySet()))
           dfs(id, map,visited, res);

       res.add(courseId);
    }

  public static void main(String arg[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      Map<String, Set<String>> map = new HashMap<>();
      ArrayList<String> ls = new ArrayList<>();
      String st = reader.readLine();
      int n=Integer.parseInt(st);
      while(n>0){
          String line = reader.readLine();
          String[] stList = line.split(" ");
          Set<String> set = new HashSet<>();
          if(stList.length==1){
              map.put(stList[0],Collections.emptySet());
          }
          else {
              for (int i = 1; i < stList.length; i++)
                  set.add(stList[i]);
              map.put(stList[0], set);
          }
          n--;
          }
      System.out.println(sort(map));

  }

}
