public class Majority {
    public static int majority(int num[]){
        int n=num.length;
        int k=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(count==n/2){
                k=num[i];
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int num[]={2,2,1,1,1,2,2};
        System.out.println(majority(num));
    }
}
