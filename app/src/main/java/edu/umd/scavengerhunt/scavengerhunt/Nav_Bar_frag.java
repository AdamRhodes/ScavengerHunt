package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Nav_Bar_frag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Nav_Bar_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Nav_Bar_frag extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Nav_Bar_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Nav_Bar_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static Nav_Bar_frag newInstance(String param1, String param2) {
        Nav_Bar_frag fragment = new Nav_Bar_frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_nav__bar_frag, container, false);

        ImageButton profileButton = (ImageButton) view.findViewById(R.id.profileButton);
        ImageButton searchButton = (ImageButton) view.findViewById(R.id.searchButton);
        ImageButton createButton = (ImageButton) view.findViewById(R.id.createButton);
        ImageButton exploreButton = (ImageButton) view.findViewById(R.id.exploreButton);

        profileButton.setOnClickListener(this);
        searchButton.setOnClickListener(this);
        createButton.setOnClickListener(this);
        exploreButton.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case(R.id.profileButton):
                gotoProfile(v);
                break;
            case(R.id.exploreButton):
                gotoExplore(v);
                break;
            case(R.id.createButton):
                gotoCreate(v);
                break;
            case(R.id.searchButton):
                gotoSearch(v);
                break;
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }








    //Navigation Methods

    public void gotoExplore(View view)
    {

        Intent intent = new Intent(this.getActivity(), Explore.class);
        startActivity(intent);

    }

    public void gotoCreate(View view)
    {

        Intent intent = new Intent(this.getActivity(), Create.class);
        startActivity(intent);

    }

    public void gotoProfile(View view)
    {

        Intent intent = new Intent(this.getActivity(), Profile.class);
        startActivity(intent);

    }

    public void gotoSearch(View view)
    {

        Intent intent = new Intent(this.getActivity(), Search.class);
        startActivity(intent);
    }

}
