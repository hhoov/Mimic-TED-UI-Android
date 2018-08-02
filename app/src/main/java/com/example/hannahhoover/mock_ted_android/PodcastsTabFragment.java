package com.example.hannahhoover.mock_ted_android;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hannahhoover.mock_ted_android.model.PodcastData;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PodcastsTabFragment extends Fragment {

    private List<PodcastData> podcastData;

    public PodcastsTabFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.tab_podcasts_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.podcasts_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), podcastData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        podcastData = new ArrayList<>();
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
        podcastData.add(new PodcastData(R.drawable.ic_launcher_foreground));
    }
}
