package com.rizal.mvvm.navigation.component.result;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rizal.mvvm.navigation.component.R;
import com.rizal.mvvm.navigation.component.databinding.FragmentResultBinding;


public class ResultFragment extends Fragment {

    FragmentResultBinding binding;

    public ResultFragment() {
        // Required empty public constructor

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_result, container, false);

        if (getArguments() != null){
            ResultFragmentArgs args =ResultFragmentArgs.fromBundle(getArguments());
            binding.tvHasil.setText(String.valueOf(args.getHasil()));
        }

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRecount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action = ResultFragmentDirections.actionResultToHome();
                Navigation.findNavController(requireView()).navigate(action);
            }
        });

        binding.btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action = ResultFragmentDirections.actionResultToLogin();
                Navigation.findNavController(requireView()).navigate(action);
            }
        });

    }
}