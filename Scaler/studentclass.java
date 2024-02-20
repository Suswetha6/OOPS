package Scaler;

public class studentclass {
  String Name;
  String Email;
  private String Password;
  protected float PSP;
  Mentorclass mentor;
  TAclass TA;
  Batchclass batch;
  public studentclass(){
    
  };
  public String getPassWord(){
    return this.Password;
  }
}
