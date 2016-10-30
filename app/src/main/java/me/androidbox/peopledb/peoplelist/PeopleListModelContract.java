package me.androidbox.peopledb.peoplelist;

import java.util.List;

import me.androidbox.peopledb.model.Person;

/**
 * Created by steve on 10/27/16.
 */
public interface PeopleListModelContract {
    /** Insert a new user into the database */
    interface InsertIntoDBListener {
        void onInsertSuccess();
        void onInsertFailure(String errMessage);
    }
    void insertPersonInto(Person person, InsertIntoDBListener insertIntoDBListener);

    /** Update a existing user in a database */
    interface UpdateDBListener {
        void onUpdateSuccess();
        void onUpdateFailure(String errMessage);
    }
    void updatePerson(Person person, UpdateDBListener updateDBListener);

    /** Delete an existing person in the database */
    interface DeleteListener {
        void onDeleteSuccess();
        void onDeleteFailure(String errMessage);
    }
    void deletePerson(Person person, DeleteListener deleteListener);

    /** Load all users from the database */
    interface LoadPersonListener {
        void onLoadPersonSuccess(List<Person> personList);
        void onLoadPersonFailure();
    }
    void loadPersons(LoadPersonListener loadPersonListener);

    /** Release all resource to avoid any memory leaks */
    void releaseResources();
}
