package com.example.playlist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playlist.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnClick {
    private ArrayList<Model> modelArrayList;
    private MusicAdapter adapter;
    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new MusicAdapter(this, modelArrayList);
        binding.recycler.setAdapter(adapter);
    }

    private void loadData() {
        modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model("Atabekov", "432", "1", "4:23"));
        modelArrayList.add(new Model("redt", "Суран4234амын", "1", "4:23"));
        modelArrayList.add(new Model("dgdfg", "4324", "1", "4:23"));
        modelArrayList.add(new Model("gdfg", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
        modelArrayList.add(new Model("Atabekov", "Суранамын", "1", "4:23"));
    }

    @Override
    public void click(Model model) {
        Bundle bundle = new Bundle();
        bundle.putString("key", model.getMusic());
        Fragment fragment = new ThirdFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.container_linear, fragment).commit();
    }
}