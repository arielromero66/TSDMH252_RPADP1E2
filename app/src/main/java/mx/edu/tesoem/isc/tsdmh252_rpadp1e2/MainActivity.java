package mx.edu.tesoem.isc.tsdmh252_rpadp1e2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText cajanombre,txtnum1,txtnum2;
    Button btnp1saluda,btnp1sumar;

    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cajanombre = findViewById(R.id.txtnombre);
        btnp1saluda = findViewById(R.id.btnp1saluda);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnp1sumar = findViewById(R.id.btnp1sumar);
        lblresultado = findViewById(R.id.lblresultado);

        btnp1saluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bienvenido a Android"+ cajanombre.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void onclicksumar(View v) {
        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = "El resultado de la suma es:" + String.valueOf( num1+num2);
        lblresultado.setText(cadena);

    }

}