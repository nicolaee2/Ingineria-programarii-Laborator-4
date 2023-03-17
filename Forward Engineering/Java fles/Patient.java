import java.util.Vector;

public class Patient extends Person {

  public String gender;

  public int age;

  public String room;

    public Vector  mySample;
    public Vector  mySample;
    /**
   * 
   * @element-type Sample
   */
  public Vector  samples;
    /**
   * 
   * @element-type Disease
   */
  public Vector  diseases;
    public Vector  myProbability;
    public Vector  myDisease;
    /**
   * 
   * @element-type Disease
   */
  public Vector  Probability;
    /**
   * 
   * @element-type Doctor
   */
  public Vector  doctors;

  public void requestDoctor( Doctor) {
  }

  public Doctor[] getAvailableDoctors() {
  return null;
  }

  public Doctor[] getDoctorList() {
  return null;
  }

  public void setAge( int) {
  }

  public void setGender( String) {
  }

  public void getInfo() {
  }

  public void removeDoctor() {
  }

}