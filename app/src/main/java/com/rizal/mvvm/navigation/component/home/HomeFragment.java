package com.rizal.mvvm.navigation.component.home;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rizal.mvvm.navigation.component.R;
import com.rizal.mvvm.navigation.component.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    HomeViewModel viewModel;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false );
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding.setViewModel(viewModel);

        binding.setLifecycleOwner(this);

        Log.d(TAG, "onCreateView: oncreate view");

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: view creted");

        binding.btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNilai1 = binding.txtNilai1.getText().toString();
                String inputNilai2 = binding.txtNilai2.getText().toString();

                if (!inputNilai1.isEmpty() && !inputNilai2.isEmpty()){
                    float nilai1 = Float.parseFloat(inputNilai1);
                    float nilai2 = Float.parseFloat(inputNilai2);

                    Log.d(TAG, "onClick: get nilai " + nilai1 + " , " + nilai2);

                    NavController navController = Navigation.findNavController(view);

                    HomeFragmentDirections.ActionHomeFragmentToResultFragment action = HomeFragmentDirections.actionHomeFragmentToResultFragment();
                    action.setHasil(viewModel.hitung(nilai1, nilai2));

                    navController.navigate(action);
                } else {
                    Toast.makeText(getContext(), "nilai harus diisi", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.imgTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNilai1 = binding.txtNilai1.getText().toString();
                String inputNilai2 = binding.txtNilai2.getText().toString();

                if (!inputNilai1.isEmpty() && !inputNilai2.isEmpty()){
                    float nilai1 = Float.parseFloat(inputNilai1);
                    float nilai2 = Float.parseFloat(inputNilai2);

                    Log.d(TAG, "onClick: get nilai " + nilai1 + " , " + nilai2);

                    NavController navController = Navigation.findNavController(view);

                    HomeFragmentDirections.ActionHomeFragmentToResultFragment action = HomeFragmentDirections.actionHomeFragmentToResultFragment();
                    action.setHasil(viewModel.hitung(nilai1, nilai2));

                    navController.navigate(action);
                } else {
                    Toast.makeText(getContext(), "nilai harus diisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}