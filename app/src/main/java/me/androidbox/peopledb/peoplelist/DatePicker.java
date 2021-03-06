package me.androidbox.peopledb.peoplelist;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import java.util.Calendar;

/**
 * Created by steve on 10/31/16.
 */

public class DatePicker extends DialogFragment {
    public DatePicker() {
    }

    public static DatePicker newInstance() {
        return new DatePicker();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        final DatePickerDialog.OnDateSetListener dateSetListener = (DatePickerDialog.OnDateSetListener)getTargetFragment();
        return new DatePickerDialog(getActivity(), dateSetListener, year, month, day);
    }
}
