class Solution {
    public int distributeCandies(int[] candyType) {
      Set<Integer> set=new HashSet();

      for(int i:candyType) set.add(i);
      if(set.size()>(candyType.length/2))
      return candyType.length/2;
      return set.size();
    }
}