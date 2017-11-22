package com.thecraftkid.parakeet.ui.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.thecraftkid.parakeet.model.Assignment;

import java.util.List;

/**
 * @version 1.0.0
 * @since v1.0.0 (11/21/2017)
 */
public class GradeListViewModel extends ViewModel {

    private MutableLiveData<List<Assignment>> assignment;

    public MutableLiveData<List<Assignment>> getAssignments() {
        if (assignment == null) {
            assignment = new MutableLiveData<>();
        }
        return assignment;
    }



}