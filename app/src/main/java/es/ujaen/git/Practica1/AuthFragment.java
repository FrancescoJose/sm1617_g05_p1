package es.ujaen.git.Practica1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AuthFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AuthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AuthFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    // TODO: Rename and change types of parameters
    private String mUser;
    private String mPass;
    private String mPuerto;

    private Registro mRegistro = new Registro("","","",0);





    public AuthFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AuthFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AuthFragment newInstance(String user, String pass,String puerto) {
        AuthFragment fragment = new AuthFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, user);
        args.putString(ARG_PARAM2, pass);
        args.putString(ARG_PARAM3,puerto);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState==null)
            if (getArguments() != null) {
                mUser = getArguments().getString(ARG_PARAM1);
                mPass = getArguments().getString(ARG_PARAM2);
                mPuerto = getArguments().getString(ARG_PARAM3);;

            }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        if(savedInstanceState!=null){
            Toast.makeText(getActivity(),"Cambio de configuración",Toast.LENGTH_SHORT).show();
            mRegistro.setmUser(savedInstanceState.getString(ARG_PARAM1));

        }
        // Inflate the layout for this fragment
        View fragmento = inflater.inflate(R.layout.form, container, false);




        EditText user = (EditText)fragmento.findViewById(R.id.user2);
        EditText pass = (EditText)fragmento.findViewById(R.id.pass);
        EditText puert = (EditText)fragmento.findViewById(R.id.puerto);

        user.setText(mUser);
        pass.setText(mPass);
        puert.setText(mPuerto);

        return fragmento;


    }




}
