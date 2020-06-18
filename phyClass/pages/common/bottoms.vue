<template name="bottoms">
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
</template>

<script>
	export default {
		"name":"bottoms",
		data() {
			return {
				
			}
		},
		methods: {
			
		}
	}
</script>

<style>

</style>
