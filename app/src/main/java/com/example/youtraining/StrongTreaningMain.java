package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StrongTreaningMain extends AppCompatActivity {

    private Button WarmUP;
    private Button BenchButton;
    private Button DeadLift;
    private Button SquatsWithABarbell;
    private Button PullUps;
    private Button WeightliftingInABend;
    private Button BlockPullToTheSideWithBothHands;
    private Button StandingUpright;
    private Button Hyperextension;
    private Button BarbellBends;
    private Button PullingBehindTheHeadOnAHighBlock;
    private Button WaistBlockStretchInSitting;
    private Button UpperBlockToChestStretch;
    private Button DumbbellSquats;
    private Button DumbbellLunges;
    private Button GakkSquats;
    private Button LegExtensions;
    private Button LegPressOnExerciseMachine;
    private Button SpreadingLegsOnTheTreadmill;
    private Button StandingBarbellBend;
    private Button ScottScampi;
    private Button DumbbellLifting;
    private Button BenchPressNarrowGrip;
    private Button FrenchBenchPress;
    private Button ExtensionOneArm;
    private Button ArmCurlsWithDumbbellsDown;
    private Button StandingBarbellPress;
    private Button BenchPressUP;
    private Button PulingBarToTheChin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strong_treaning_main);

        PulingBarToTheChin = (Button) findViewById(R.id.PulingBarToTheChin);
        PulingBarToTheChin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openPulingBarToTheChin();
            }
        });

        BenchPressUP = (Button) findViewById(R.id.BenchPressUP);
        BenchPressUP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openBenchPressUP();
            }
        });

        StandingBarbellPress = (Button) findViewById(R.id.StandingBarbellPress);
        StandingBarbellPress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openStandingBarbellPress();
            }
        });

        ArmCurlsWithDumbbellsDown = (Button) findViewById(R.id.ArmCurlsWithDumbbellsDown);
        ArmCurlsWithDumbbellsDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openArmCurlsWithDumbbellsDown();
            }
        });

        ExtensionOneArm = (Button) findViewById(R.id.ExtensionOneArm);
        ExtensionOneArm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openExtensionOneArm();
            }
        });

        FrenchBenchPress = (Button) findViewById(R.id.FrenchBenchPress);
        FrenchBenchPress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openFrenchBenchPress();
            }
        });


        BenchPressNarrowGrip = (Button) findViewById(R.id.BenchPressNarrowGrip);
        BenchPressNarrowGrip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openBenchPressNarrowGrip();
            }
        });

        DumbbellLifting = (Button) findViewById(R.id.DumbbellLifting);
        DumbbellLifting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openDumbbellLifting();
            }
        });

        ScottScampi = (Button) findViewById(R.id.ScottScampi);
        ScottScampi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openScottScampi();
            }
        });

        StandingBarbellBend = (Button) findViewById(R.id.StandingBarbellBend);
        StandingBarbellBend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openStandingBarbellBends();
            }
        });

        DumbbellLunges = (Button) findViewById(R.id.DumbbellLunges);
        DumbbellLunges.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openDumbbellLunges();
            }
        });

        SpreadingLegsOnTheTreadmill = (Button) findViewById(R.id.SpreadingLegsOnTheTreadmill);
        SpreadingLegsOnTheTreadmill.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openSpreadingLegsOnTheTreadmill();
            }
        });

        LegPressOnExerciseMachine = (Button) findViewById(R.id.LegPressOnExerciseMachine);
        LegPressOnExerciseMachine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openLegPressOnExerciseMachine();
            }
        });

        LegExtensions = (Button) findViewById(R.id.LegExtensions);
        LegExtensions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openLegExtensions();
            }
        });

        GakkSquats = (Button) findViewById(R.id.GakkSquats);
        GakkSquats.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openGakkSquats();
            }
        });

        DumbbellSquats = (Button) findViewById(R.id.DumbbellSquats);
        DumbbellSquats.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openDumbbellSquats();
            }
        });

        UpperBlockToChestStretch = (Button) findViewById(R.id.UpperBlockToChestStretch);
        UpperBlockToChestStretch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openUpperBlockToChestStretch();
            }
        });

        WaistBlockStretchInSitting = (Button) findViewById(R.id.WaistBlockStretchInSitting);
        WaistBlockStretchInSitting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openWaistBlockStretchInSitting();
            }
        });

        PullingBehindTheHeadOnAHighBlock = (Button) findViewById(R.id.PullingBehindTheHeadOnAHighBlock);
        PullingBehindTheHeadOnAHighBlock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openPullingBehindTheHeadOnAHighBlock();
            }
        });

        BarbellBends = (Button) findViewById(R.id.BarbellBends);
        BarbellBends.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openBarbellBends();
            }
        });

        Hyperextension = (Button) findViewById(R.id.Hyperextension);
        Hyperextension.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openHyperextenson();
            }
        });


        StandingUpright = (Button) findViewById(R.id.StandingUpright);
        StandingUpright.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openStandingUpright();
            }
        });

        BlockPullToTheSideWithBothHands = (Button) findViewById(R.id.BlockPullToTheSideWithBothHands);
        BlockPullToTheSideWithBothHands.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openBlockPullToTheSideWithBothHands();
            }
        });

        WeightliftingInABend = (Button) findViewById(R.id.WeightliftingInABend);
        WeightliftingInABend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openWeightliftingInABend();
            }
        });

        WarmUP = (Button) findViewById(R.id.WarmUP);
        WarmUP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openWarmUP();
            }
        });

        BenchButton = (Button) findViewById(R.id.BenchButton);
        BenchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openBenchActitvity();
            }
        });

        DeadLift = (Button) findViewById(R.id.DeadLift);
        DeadLift.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openDeadLiftActivity();
            }
        });

        SquatsWithABarbell = (Button) findViewById(R.id.SquatsWithABarbell);
        SquatsWithABarbell.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openSquatsWithABarbell();
            }
        });

        PullUps = (Button) findViewById(R.id.PullUps);
        PullUps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openPullUps();
            }
        });
    }

    public void  openExtensionOneArm(){
        Intent intent = new Intent(this,ExtensionOneArm.class);
        startActivity(intent);
    }

    public void openDumbbellLunges(){
        Intent intent = new Intent(this,DumbbellLunges.class);
        startActivity(intent);
    }

    public void openSpreadingLegsOnTheTreadmill(){
        Intent intent = new Intent(this,SpreadingLegsOnTheTreadmill.class);
        startActivity(intent);
    }

    public void openLegPressOnExerciseMachine(){
        Intent intent = new Intent(this,LegPressAnExerciseMachine.class);
        startActivity(intent);
    }

    public void openLegExtensions(){
        Intent intent = new Intent(this,LegExtensions.class);
        startActivity(intent);
    }

    public void openGakkSquats(){
        Intent intent = new Intent(this,GakkSquats.class);
        startActivity(intent);
    }


    public void openDumbbellSquats(){
        Intent intent = new Intent(this,DumbbellSquats.class);
        startActivity(intent);
    }

    public void openUpperBlockToChestStretch(){
        Intent intent = new Intent(this,UpperBlockToChestStretch.class);
        startActivity(intent);
    }

    public void openWaistBlockStretchInSitting(){
        Intent intent = new Intent(this,WaistBlockStretchInSitting.class);
        startActivity(intent);
    }

    public void openPullingBehindTheHeadOnAHighBlock(){
        Intent intent = new Intent(this,PullingBehindTheHeadOnAHighBlock.class);
        startActivity(intent);
    }

    public void openBarbellBends(){
        Intent intent = new Intent(this,BarbellBends.class);
        startActivity(intent);
    }

    public void openArmCurlsWithDumbbellsDown(){
        Intent intent = new Intent(this,ArmCurlsWithDumbbellsDown.class);
        startActivity(intent);
    }

    public void openHyperextenson(){
        Intent intent = new Intent(this,Hyperextension.class);
        startActivity(intent);
    }

    public void openStandingUpright(){
        Intent intent = new Intent(this,StandingUpright.class);
        startActivity(intent);
    }

    public void openBlockPullToTheSideWithBothHands(){
        Intent intent = new Intent(this,BlockPullToTheSideWithBothHands.class);
        startActivity(intent);
    }

    public void openFrenchBenchPress(){
        Intent intent = new Intent(this,FrenchBenchPress.class);
        startActivity(intent);
    }

    public void openWeightliftingInABend(){
        Intent intent = new Intent(this,WeightliftingInABend.class);
        startActivity(intent);
    }

    public void openPullUps(){
        Intent intent = new Intent(this,PullUps.class);
        startActivity(intent);
    }

    public void openSquatsWithABarbell(){
        Intent intent = new Intent(this,SquatsWithABarbell.class);
        startActivity(intent);
    }

    public void openStandingBarbellBends(){
        Intent intent = new Intent(this,StandingBarbellBend.class);
        startActivity(intent);
    }

    public void openDeadLiftActivity(){
        Intent intent = new Intent(this,Deadlift.class);
        startActivity(intent);
    }

    public void openWarmUP(){
        Intent intent = new Intent(this,WarmUP.class);
        startActivity(intent);
    }

    public void openBenchActitvity(){
        Intent intent = new Intent(this, BenchPress.class);
        startActivity(intent);
    }

    public void openScottScampi(){
        Intent intent = new Intent(this, ScottScampi.class);
        startActivity(intent);
    }

    public void  openDumbbellLifting(){
        Intent intent = new Intent(this, DumbbellLifting.class);
        startActivity(intent);
    }

    public void  openBenchPressNarrowGrip(){
        Intent intent = new Intent(this, BenchPressNarrowGrip.class);
        startActivity(intent);
    }

    public void  openStandingBarbellPress(){
        Intent intent = new Intent(this, StandingBarbellPress.class);
        startActivity(intent);
    }

    public void  openBenchPressUP(){
        Intent intent = new Intent(this, BenchPressUP.class);
        startActivity(intent);
    }


    public void  openPulingBarToTheChin(){
        Intent intent = new Intent(this, BenchPressUP.class);
        startActivity(intent);
    }
}