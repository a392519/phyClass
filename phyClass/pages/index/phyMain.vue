<template>
	<view>
		<pmain v-if="PageCur=='pmain'"></pmain>
		<question v-if="PageCur=='question'"></question>
		<about v-if="PageCur=='about'"></about>
		<!-- <about v-if="PageCur"></about> -->
		<view class="cu-bar tabbar bg-white shadow foot">
			<view class="action" @click="NavChange" data-cur="pmain">
				<view class='cuIcon-cu-image'>
					<image :src="'/static/tabbar/basics' + [PageCur=='pmain'?'_cur':''] + '.png'"></image>
				</view>
				<view :class="PageCur=='pmain'?'text-green':'text-gray'">首页</view>
			</view>
			<view class="action" @click="NavChange" data-cur="question">
				<view class='cuIcon-cu-image'>
					<image :src="'/static/tabbar/component' + [PageCur == 'question'?'_cur':''] + '.png'"></image>
				</view>
				<view :class="PageCur=='question'?'text-green':'text-gray'">题库</view>
			</view>
			<view class="action" @click="NavChange" data-cur="about">
				<view class='cuIcon-cu-image'>
					<image :src="'/static/tabbar/about' + [PageCur == 'about'?'_cur':''] + '.png'"></image>
				</view>
				<view :class="PageCur=='about'?'text-green':'text-gray'">关于</view>
			</view>
		</view>
	</view>
	
</template>

<script>
	export default {
		data() {
		return {
				PageCur: 'pmain',
				
			}
		},
		methods: {
			NavChange: function(e) {
				this.PageCur = e.currentTarget.dataset.cur
				var a=this.$route.params.name;
				console.log(this.$router)
				
			}
		},
		created:{
			
		}
	}
</script>

<style>
</style>
