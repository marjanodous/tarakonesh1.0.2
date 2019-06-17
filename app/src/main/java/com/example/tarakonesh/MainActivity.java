package com.example.tarakonesh;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout lnr_expense, lnr_prelude, lnr_bank_Account, lnr_financial_account;
    ImageView up_daramadi, up_expense, up_bank_Account, up_financial_account, add_prelude, add_expense, add_bank_Account, add_financial_account,about;
    Boolean flag_dropDpwn = false;
    userApp user = new userApp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lnr_expense = findViewById(R.id.lnr_expense);
        lnr_bank_Account = findViewById(R.id.lnr_bank_Account);
        lnr_prelude = findViewById(R.id.lnr_prelude);
        lnr_financial_account = findViewById(R.id.lnr_financial_account);

        up_daramadi = findViewById(R.id.up_prelude);
        up_expense = findViewById(R.id.up_expense);
        up_bank_Account = findViewById(R.id.up_bank_Account);
        up_financial_account = findViewById(R.id.up_financial_account);

        add_prelude = findViewById(R.id.add_prelude);
        add_expense = findViewById(R.id.add_expense);
        add_bank_Account = findViewById(R.id.add_bank_Account);
        add_financial_account = findViewById(R.id.add_financial_account);

        add_prelude.setImageResource(R.drawable.ic_add);
        add_expense.setImageResource(R.drawable.ic_add);
        add_bank_Account.setImageResource(R.drawable.ic_add);
        add_financial_account.setImageResource(R.drawable.ic_add);

        up_daramadi.setImageResource(R.drawable.ic_up);
        up_expense.setImageResource(R.drawable.ic_up);
        up_bank_Account.setImageResource(R.drawable.ic_up);
        up_financial_account.setImageResource(R.drawable.ic_up);

        about.findViewById(R.id.about);



        up_daramadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnr_prelude.getVisibility() == View.GONE) {
                    lnr_prelude.setVisibility(View.VISIBLE);
                } else {
                    lnr_prelude.setVisibility(View.GONE);
                }


                if (!flag_dropDpwn) {
                    up_daramadi.setImageResource(R.drawable.ic_down);
                    flag_dropDpwn = true;
                } else {
                    up_daramadi.setImageResource(R.drawable.ic_up);
                    flag_dropDpwn = false;

                }


            }
        });
        up_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnr_expense.getVisibility() == View.GONE) {
                    lnr_expense.setVisibility(View.VISIBLE);
                } else {
                    lnr_expense.setVisibility(View.GONE);
                }


                if (!flag_dropDpwn) {
                    up_expense.setImageResource(R.drawable.ic_down);
                    flag_dropDpwn = true;
                } else {
                    up_expense.setImageResource(R.drawable.ic_up);
                    flag_dropDpwn = false;

                }
            }
        });
        up_bank_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnr_bank_Account.getVisibility() == View.GONE) {
                    lnr_bank_Account.setVisibility(View.VISIBLE);
                } else {
                    lnr_bank_Account.setVisibility(View.GONE);
                }


                if (!flag_dropDpwn) {
                    up_bank_Account.setImageResource(R.drawable.ic_down);
                    flag_dropDpwn = true;
                } else {
                    up_bank_Account.setImageResource(R.drawable.ic_up);
                    flag_dropDpwn = false;

                }
            }
        });
        up_financial_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lnr_financial_account.getVisibility() == View.GONE) {
                    lnr_financial_account.setVisibility(View.VISIBLE);
                } else {
                    lnr_financial_account.setVisibility(View.GONE);
                }


                if (!flag_dropDpwn) {
                    up_financial_account.setImageResource(R.drawable.ic_down);
                    flag_dropDpwn = true;
                } else {
                    up_financial_account.setImageResource(R.drawable.ic_up);
                    flag_dropDpwn = false;

                }

            }
        });
        add_prelude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });


        add_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, tabs.class));
            }
        });
        add_financial_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,hesab_mali.class));
            }
        });
        add_bank_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,hesab_banki.class));
            }
        });

////////////////////////// SharedPreference
        final SharedPreferencesManager sharedPreferencesManager = new SharedPreferencesManager(this);
        user = sharedPreferencesManager.get_shared_preferences();
        if (user.getFirst_time_run() == true) {
            Toast.makeText(this, "اطلاعات کاربری خود را وارد کنید", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, login.class));
            MainActivity.this.finish();
            user.setFirst_time_run(true);
            sharedPreferencesManager.set_false_first_time(user);
        } else {
            Toast.makeText(this, "کاربر سیستم خوش آمدید", Toast.LENGTH_SHORT).show();
        }

    }
}
