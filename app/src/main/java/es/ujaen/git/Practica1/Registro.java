package es.ujaen.git.Practica1;



/**
 * Created by Francisco on 25/09/2016.
 */
public class Registro {

    public static final int SERVICE_PORT=6000;
    protected String mUser="user";
    protected String mPass="";
    protected String mIP="127.0.0.1";
    protected int mPor=SERVICE_PORT;


    public Registro(String user,String pass,String IP,int port){
        this.mUser = user;
        this.mPass = pass;
        this.mIP = IP;
        this.mPor = port;


    }

    /**
     *
     * @return
     */
    public String getmUser(){

        return mUser;
    }


    /**
     *
     * @return
     */
    public String getmPass(){

        return mPass;
    }


    public int getmPort(){
        return mPor;
    }


    /**
     *
     * @param mUser
     */
    public void setmUser(String mUser) {
        this.mUser = mUser;
    }


    /**
     *
     * @param mPass
     */
    public void setmPass(String mPass) {
        this.mPass = mPass;
    }


    public void setmPuerto(int mPor) {
        this.mPor = mPor;
    }


}
