package com.example.hannahhoover.mimic_ted_ui_android;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaylistsTabFragment extends Fragment {

    public PlaylistsTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_playlists_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
        return recyclerView;
    }

}
