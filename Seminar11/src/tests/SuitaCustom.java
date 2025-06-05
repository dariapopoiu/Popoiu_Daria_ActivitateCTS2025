package tests;

import categorii.CategorieCORRECT;
import categorii.CategorieRightBICEP;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({AplicaDiscountTest.class, GetVarstaTest.class})
@Categories.IncludeCategory(CategorieCORRECT.class)
@Categories.ExcludeCategory(CategorieRightBICEP.class)
public class SuitaCustom {
}
