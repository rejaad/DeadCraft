package net.rejaad.deadcraft.procedures;

import net.rejaad.deadcraft.DeadcraftMod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StartupProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		assert Boolean.TRUE; //#dbg:Startup:Join
		if (!(world.getDifficulty() == Difficulty.HARD)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"difficulty hard");
			assert Boolean.TRUE; //#dbg:Startup:Hard
		}
		if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("deadcraft:join_survivors"))).isDone()) {
			assert Boolean.TRUE; //#dbg:Startup:Is_Survivor
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Welcome back Survivor..."), false);
		} else {
			assert Boolean.TRUE; //#dbg:Startup:Is_Not_Survivor
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"time set 11000t");
			assert Boolean.TRUE; //#dbg:Startup:Time_Set
			if (world instanceof Level _level)
				_level.getScoreboard().addPlayerTeam("Survivor");
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Survivor");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"scoreboard objectives add zombieKills minecraft.killed:minecraft.zombie \"Zombies Killed\"");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"scoreboard objectives setdisplay list zombieKills");
			assert Boolean.TRUE; //#dbg:Startup:Scoreboard_Set
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("deadcraft:join_survivors"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			DeadcraftMod.queueServerWork(40, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Welcome Survivor..."), false);
				DeadcraftMod.queueServerWork(40, () -> {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("The world has gone downhill recently..."), false);
					DeadcraftMod.queueServerWork(40, () -> {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("You had better find shelter for the night..."), false);
						DeadcraftMod.queueServerWork(40, () -> {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Before \u00A7c\u00A7nTHEY\u00A7r come out..."), false);
							DeadcraftMod.queueServerWork(40, () -> {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Here take this basic gear."), false);
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.LEATHER_CHESTPLATE).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.LEATHER_LEGGINGS).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.WOODEN_SWORD).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.COOKED_BEEF).copy();
									_setstack.setCount(16);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Blocks.TORCH).copy();
									_setstack.setCount(8);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								DeadcraftMod.queueServerWork(1800, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"enhancedcelestials setLunarEvent enhancedcelestials:extreme_zombie_moon");
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("\u00A7c\u00A7nHide"), false);
								});
							});
							assert Boolean.TRUE; //#dbg:Startup:Done_Speaking
						});
					});
				});
			});
		}
	}
}
