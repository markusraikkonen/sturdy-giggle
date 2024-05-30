package name.yliveto.datagen;

import name.yliveto.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.item.Items.SUGAR;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> CARAMEL_SMELTABLE = List.of(SUGAR);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerBlasting(exporter, CARAMEL_SMELTABLE, RecipeCategory.MISC, ModItems.CARAMEL,
                0.1f, 50, "caramel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DUMLEOATDRINK)
                .pattern("CPC")
                .pattern("POP")
                .pattern("CPC")
                .input('C', ModItems.CARAMEL)
                .input('P', ModItems.COCOAPOWDER)
                .input('O', ModItems.BUCKETOFOATMILK)
                .criterion(hasItem(ModItems.COCOAPOWDER), conditionsFromItem(ModItems.COCOAPOWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DUMLEOATDRINK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PATKISOATDRINK)
                .pattern("MPM")
                .pattern("POP")
                .pattern("MPM")
                .input('M', ModItems.MINT)
                .input('P', ModItems.COCOAPOWDER)
                .input('O', ModItems.BUCKETOFOATMILK)
                .criterion(hasItem(ModItems.COCOAPOWDER), conditionsFromItem(ModItems.COCOAPOWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PATKISOATDRINK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUCKETOFOATMILK)
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" B ")
                .input('W', Items.WHEAT)
                .input('B', Items.BUCKET)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BUCKETOFOATMILK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHOCOLATEBAR)
                .pattern("CS")
                .pattern("SC")
                .input('S', SUGAR)
                .input('C', Items.COCOA_BEANS)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHOCOLATEBAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUCKETOFCYANIDE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.BOTTLEOFCYANIDE)
                .criterion(hasItem(ModItems.BOTTLEOFCYANIDE), conditionsFromItem(ModItems.BOTTLEOFCYANIDE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BUCKETOFCYANIDE)));



    }
}
