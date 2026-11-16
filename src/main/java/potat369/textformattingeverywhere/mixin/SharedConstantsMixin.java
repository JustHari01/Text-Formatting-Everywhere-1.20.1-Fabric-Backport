package potat369.textformattingeverywhere.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public abstract class SharedConstantsMixin {
    @Inject(method = "isAllowedChatCharacter(C)Z", at = @At("RETURN"), cancellable = true)
    private static void textFormattingEverywhere$allowSectionSign(char character, CallbackInfoReturnable<Boolean> cir) {
        if (character == 167) {
            cir.setReturnValue(true);
        }
    }
}
