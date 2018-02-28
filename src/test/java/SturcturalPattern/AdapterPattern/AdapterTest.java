package SturcturalPattern.AdapterPattern;

import StructuralPattern.AdapterPattern.CompositeAdapter;
import StructuralPattern.AdapterPattern.ElectricCurrent;
import StructuralPattern.AdapterPattern.InheritAdapter;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void testInheritAdapter() {
        ElectricCurrent inheritAdapter = new InheritAdapter();
        inheritAdapter.eCurrent();
    }

    @Test
    public void testCompositeAdapter() {
        ElectricCurrent electricCurrent = new ElectricCurrent();
        CompositeAdapter compositeAdapter = new CompositeAdapter(electricCurrent);
        compositeAdapter.eCurrent();
    }
}
