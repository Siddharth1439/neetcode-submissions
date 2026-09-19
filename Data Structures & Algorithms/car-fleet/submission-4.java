class Car{
    int position;
    double TimeToTarget;
    Car(int position,double TimeToTarget){
        this.position = position;
        this.TimeToTarget = TimeToTarget;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        if(n==1) return 1;
        Car[] car = new Car[n];

        for(int i=0;i<n;i++){
            car[i] = new Car(position[i],((double)target-position[i])/speed[i]);
        }
        Arrays.sort(car,(a,b) -> Integer.compare(b.position,a.position));
        int count = 0;
        double lastTime = 0;
        for(int i=0;i<n;i++){
            if(car[i].TimeToTarget > lastTime) {count++;
            lastTime = car[i].TimeToTarget;}
        }
        return count;
    }
}
