<template>
	<view class="contents">
		<uni-view class="cu-bar fixed grid col-1 mytitles bg-gradual-red">
				<uni-view class="mytext mytextI">我
				</uni-view>
				<div align="center" class="imgdiv">
					<uni-view class="cu-avatar xl round  mytitle "
					>
					</uni-view>
				</div>
			<uni-view class="mytext">158****3443</uni-view>
		</uni-view>
		<uni-view class="grid bg-white margin-bottom text-center col-2 ti">
			<uni-view class="padding  ">0</uni-view>
			<uni-view class="padding ">0</uni-view>
			<uni-view class="padding-bottom ">
				<uni-view>答题数</uni-view>
				<uni-view>正确率0%</uni-view>
			</uni-view>
			<uni-view class="padding-bottom ">
				<uni-view>真题答题平均分</uni-view>
				<uni-view>答题0次</uni-view>
			</uni-view>
		</uni-view>
		<uni-view class="cu-list menu sm-border mains">
			<uni-view class="cu-item arrow">
				<uni-view class="content">
					<uni-text class="cuIcon-people text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>个人资料</span>
					</uni-text>
				</uni-view>
			</uni-view>
			<uni-view class="cu-item arrow">
				<uni-view class="content">
					<uni-text class="cuIcon-hot text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>会员中心</span>
					</uni-text>
				</uni-view>
			</uni-view>
			<uni-view class="cu-item arrow">
				<uni-view class="content">
					<uni-text class="cuIcon-text text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>我的错题</span>
					</uni-text>
				</uni-view>
			</uni-view>
			<uni-view class="cu-item arrow mycenter">
				<uni-view class="content">
					<uni-text class="cuIcon-likefill text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>我的收藏</span>
					</uni-text>
				</uni-view>
			</uni-view>
			<uni-view class="cu-item arrow">
				<uni-view class="content">
					<uni-text class="cuIcon-emoji text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>交流群号：44444444,技术支持:412999999</span>
					</uni-text>
				</uni-view>
			</uni-view>
			<uni-view class="cu-item arrow">
				<uni-view class="content">
					<uni-text class="cuIcon-communityfill text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>帮助与反馈</span>
					</uni-text>
				</uni-view>
			</uni-view>
			<uni-view class="cu-item arrow">
				<uni-view class="content">
					<uni-text class="cuIcon-apps text-grey"></uni-text>
					<uni-text class="text-grey">
						<span>关于</span>
					</uni-text>
				</uni-view>
			</uni-view>
		</uni-view>
	</view>
</template>

<script>
	export default {
		"name":"about",
		data() {
			return {
				
			}
		},
		methods: {
			
		}
	}
</script>

<style>
	.contents{
		margin: 0;
		padding: 0;
		
	}
	.mains{
		/* margin-top: 170px; */
		margin-top: 10px;
	}
	.mytextI{
		font-size: 20px;
		padding-top: 10px;
	}
	.mytext{
		text-align: center;
		justify-content: center;
		margin-top: 5px;
	}
	.mytitles{
		height: 150px;
		margin-top: 0;
		border-bottom-left-radius:20px;
		border-bottom-right-radius:20px;
	}
	.mytitle{
		background-image: url('https://ossweb-img.qq.com/images/lol/web201310/skin/big25002.jpg');
	}
	.imgdiv{
		height: 70px;
		width: 70px;
		margin-left: 300rpx;
		margin: 0 ,auto;
	}
	.ti{
		margin-top:170px;
		height: 100px;
	}
	
</style>
