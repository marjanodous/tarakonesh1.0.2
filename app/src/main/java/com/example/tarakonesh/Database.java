package com.example.tarakonesh;

/*support telgram id =@javaprogrammer_eh
 * 24/03/1398
 * creted by elmira hossein zadeh*/

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;


public class Database {

    private static DatabaseHelper databaseHelper;

    private static final String user_app_table = "user_app";
    private static final String transaction_table = "`transaction`";
    private static final String finacial_account_table = "finacial_account";
    private static final String bank_accounts_table = "bank_accounts";

    private static final String _ID = "id";

    public Database() {
    }

    public static SQLiteDatabase getInstance(Context context) {
        if (databaseHelper == null) {
            try {
                databaseHelper = new DatabaseHelper(context);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return databaseHelper.getWritableDatabase();
    }

    public static SQLiteDatabase getInstance2(Context context) {
        if (databaseHelper == null) {
            try {
                databaseHelper = new DatabaseHelper(context);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return databaseHelper.getReadableDatabase();
    }

    public static String[] getDataBankAccounts(Context context) {
        String selectQuery = "SELECT  * FROM " + bank_accounts_table;
        Cursor cursor = getInstance2(context).rawQuery(selectQuery, null, null);
        ArrayList<String> spinnerContent = new ArrayList<String>();
        if (cursor.moveToFirst()) {
            do {
                String word = cursor.getString(cursor.getColumnIndexOrThrow("account_name"));
                spinnerContent.add(word);
            } while (cursor.moveToNext());
        }
        cursor.close();
        String[] allSpinner = new String[spinnerContent.size()];
        allSpinner = spinnerContent.toArray(allSpinner);
        return allSpinner;
    }

    public static String[] getDataFinacialAccount(Context context) {
        String selectQuery = "SELECT  * FROM " + finacial_account_table;
        Cursor cursor = getInstance2(context).rawQuery(selectQuery, null, null);
        ArrayList<String> spinnerContent = new ArrayList<String>();
        if (cursor.moveToFirst()) {
            do {
                String word = cursor.getString(cursor.getColumnIndexOrThrow("finacial_account_name"));
                spinnerContent.add(word);
            } while (cursor.moveToNext());
        }
        cursor.close();
        String[] allSpinner = new String[spinnerContent.size()];
        allSpinner = spinnerContent.toArray(allSpinner);
        return allSpinner;
    }

    public static String[] getDatatransactionDaramad(Context context) {
        String selectQuery = "SELECT  * FROM " + transaction_table + " WHERE transaction_type='درآمد'";
        Cursor cursor = getInstance2(context).rawQuery(selectQuery, null, null);
        ArrayList<String> spinnerContent = new ArrayList<String>();
        if (cursor.moveToFirst()) {
            do {
                String word = cursor.getString(cursor.getColumnIndexOrThrow("money"));
                //   Log.i("getDatatransactAAAAAAAA", cursor.getString(cursor.getColumnIndex("money")));

                spinnerContent.add(word);
            } while (cursor.moveToNext());
        }
        cursor.close();
        String[] allSpinner = new String[spinnerContent.size()];
        allSpinner = spinnerContent.toArray(allSpinner);
        return allSpinner;
    }

    public static String[] getDatatransactionHazineh(Context context) {
        String selectQuery = "SELECT  * FROM " + transaction_table + " WHERE transaction_type='هزینه'";
        Cursor cursor = getInstance2(context).rawQuery(selectQuery, null, null);
        ArrayList<String> spinnerContent = new ArrayList<String>();
        if (cursor.moveToFirst()) {
            do {
                String word = cursor.getString(cursor.getColumnIndexOrThrow("money"));
                //   Log.i("getDatatransactAAAAAAAA", cursor.getString(cursor.getColumnIndex("money")));

                spinnerContent.add(word);
            } while (cursor.moveToNext());
        }
        cursor.close();
        String[] allSpinner = new String[spinnerContent.size()];
        allSpinner = spinnerContent.toArray(allSpinner);
        return allSpinner;
    }

    public static void addLoginData(String userName, String passWord, Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_name", userName);
        contentValues.put("password", passWord);
        // Inserting Row
        getInstance(context).insert(user_app_table, null, contentValues);
        getInstance(context).close(); // Closing database connection
    }

    public static void addBankAccountsData(String accountName, String accountNumber, Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_name", accountName);
        contentValues.put("account_number", accountNumber);
        // Inserting Row
        getInstance(context).insert(bank_accounts_table, null, contentValues);
        getInstance(context).close(); // Closing database connection
    }

    public static void addFinacialAccountData(String finacialAccountName, Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("finacial_account_name", finacialAccountName);
        // Inserting Row
        getInstance(context).insert(finacial_account_table, null, contentValues);
        getInstance(context).close(); // Closing database connection
    }

    public static void addTransactionData(String finacial_account_fk, String bank_account_fk,
                                          String transActionType, String date
            , String time, String phone_number,
                                          String money, String trans_number, String reference,
                                          String trans_result, String details, Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("finacial_account_fk", finacial_account_fk);
        contentValues.put("bank_account_fk", bank_account_fk);
        contentValues.put("transaction_type", transActionType);
        contentValues.put("date", date);
        contentValues.put("time", time);
        contentValues.put("phone_number", phone_number);
        contentValues.put("money", money);
        contentValues.put("trans_number", trans_number);
        contentValues.put("reference", reference);
        contentValues.put("trans_result", trans_result);
        contentValues.put("details", details);
        // Inserting Row
        getInstance(context).insert(transaction_table, null, contentValues);
        getInstance(context).close(); // Closing database connection
    }
}