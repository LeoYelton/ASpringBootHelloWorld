<class_declaration>
<package_declaration>package org.example;</package_declaration>
<class_name>FinancialData</class_name>
<class_body>
<import_declaration>import java.util.Random;</import_declaration>
<method_declaration>
public double[] fetchData() {
double[] data = new double[1000];
for (int i = 0; i < data.length; i++) {
data[i] = new Random().nextDouble() * 100.0;
}
return data;
}
</method_declaration>
</class_body>
</class_declaration>
