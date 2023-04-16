package com.example.clubolympus.data;

import android.provider.BaseColumns;

public final class ClubOlympusContract {
    private ClubOlympusContract() {

    }

    public  static final  class MemberEntry implements BaseColumns {

        public static final String TABLE_NAME = "members";

        public static final String _ID = "id";
        public static final String KEY_FIRST_NAME = "firstName";
        public static final String KEY_LAST_NAME = "lastName";
        public static final String KEY_GENDER = "gender";
        public static final String KEY_GROUP = "group";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
