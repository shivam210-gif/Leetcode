public class LC_2105 {
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i=0;
        int j=plants.length-1;
        int count=0;
        int m=capacityA;
        int n=capacityB;
        while(i<j){
            if(plants[i]>capacityA){
                capacityA=m;
                count++;
            }
            capacityA-=plants[i];

            if(plants[j]>capacityB){
                capacityB=n;
                count++;
            }
            capacityB-=plants[j];

            i++;
            j--;
        }
        if(i==j){
            int max=Math.max(capacityA,capacityB);
            if(max<plants[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []plants = {2,2,3,3}; 
        int capacityA = 3, capacityB = 4;
        System.out.println(minimumRefill(plants, capacityA, capacityB));
    }
}
