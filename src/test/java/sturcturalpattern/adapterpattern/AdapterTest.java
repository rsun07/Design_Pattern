package sturcturalpattern.adapterpattern;

import structuralpattern.adapterpattern.CompositeAdapter;
import structuralpattern.adapterpattern.ElectricCurrent;
import structuralpattern.adapterpattern.InheritAdapter;
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
