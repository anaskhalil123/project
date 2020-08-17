package tripcomputer;

import sun.reflect.ReflectionFactory;

/*  
    this calss to compute the time of atrip.
 */
public class TripComputer {

    public TripComputer() {
    }

    private int totalTime;
    private boolean restStopTaken = false;

    /*
    ................
    ................
    ................
     */
    public void computeLegTime(float distance, float speed) {
        float time = 0.0f;
        try {
            if (distance < 0 || speed < 0) {
                throw new Exception("Error");
            } else {
                time = distance / speed;
                System.out.println("the time in this leg is " + time + " hours");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void takeRestStop(float time) {
        try {
            if (time < 0) {
                throw new Exception("Error");
            } else if (this.isRestStopTaken() == true) {
                throw new Exception("you can not take two rest stop in a row");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /*
    .....................
    .....................
    .....................
     */
    public void setTotalTime(int tctotaltime) {
        this.totalTime = tctotaltime;
    }

    public int getTripTime() {
        return this.totalTime;
    }

    public void setRestStopTaken(boolean restStopTaken) {
        this.restStopTaken = restStopTaken;
    }

    public boolean isRestStopTaken() {
        return restStopTaken;
    }

}
