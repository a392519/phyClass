<template>
	<view>
		<meta http-equiv="Access-Control-Allow-Origin" content="*" />
		<uni-view class="page">
			<div class="uni-scroll-view" style="overflow-x:hidden; overflow-y: auto;">
				<uni-view class="cu-custom" style="height:50px ;">
					<uni-view class="cu-bar grid col-1 none-bg text-white bg-img text-ong" >
					<uni-view class="textTitle">中学物理视频推荐</uni-view>
					<uni-view class="textTitle_">#2019-2020最新物理视频锦集#</uni-view>
					</uni-view>
				</uni-view>
				<uni-view class="cu-item bg-img shadow-blur text-other action" v-for="(item,index) in eachClass" :key="index" 
				:style="{backgroundImage: 'url(' + item.pic+ ')'}" @click="lookVideo(item)" >
					<uni-view class="cardTile eachText" >{{item.title}}</uni-view>
				</uni-view>
				<uni-view class="cu-tabbar-height"></uni-view>
			</div>
		</uni-view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				vgrade:"高三",
				eachClass:[
					{
					title:"高三物理冲刺",
					pic:"https://image.weilanwl.com/color2.0/plugin/sylb2244.jpg"
				},
				{
					title:"高二物理提升",
					pic:"https://image.weilanwl.com/color2.0/plugin/wdh2236.jpg"
				},
				{
					title:"高一物理",
					pic:"https://image.weilanwl.com/color2.0/plugin/qpct2148.jpg"
				},
				{
					title:"初三物理",
					pic:"https://image.weilanwl.com/color2.0/plugin/qpczdh2307.jpg"
				},
				{
					title:"初二物理",
					pic:"https://image.weilanwl.com/color2.0/plugin/wdh2236.jpg"
				},
				]
					
				
			}
		},
		methods: {
			lookVideo:function(e){
				console.log(e.title)
				uni.navigateTo({
					url:'/pages/pmain/videos/videos?titles='+e.title
				})
				
				}
			}
		
	}
</script>

<style>
	.text-ong{
		height: 60px;
		 padding-top: 0px; 
		 background-image:
		url('https://image.weilanwl.com/color2.0/plugin/cjkz2329.jpg');
	}
	.text-other{
		height: 100px;
		margin-top: 20px;
		border-radius: 10px;
	}
	.eachText{
		color: white;
		text-align: center;
		font-size: 20px;
		vertical-align: center;
		line-height: 50px;
		padding-top:20px ;
	}
	.textTitle{
		font-size: 20px;
		text-align: center;
		padding-top: 10px;
	}
	.textTitle_{
		font-size: 12px;
		text-align: center;
	}
</style>
