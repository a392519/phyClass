<template>
	<view>
		<!--在视频外面加一个容器-->
		<div class="input_video">
			<video-player class="video-player vjs-custom-skin" ref="videoPlayer" :playsinline="true" :options="playerOptions"></video-player>
		</div>

		<ly-tree :tree-data="data" 
        :ready="ready"
        node-key="nodeId" 
        @node-expand="handleNodeExpand" 
        
		@node-click="handleNodeClick"
		:defaultExpandAll="true">

		</ly-tree>
	</view>
</template>

<script>
	import LyTree from '../../common/ly-tree/ly-tree.vue'

	export default {
		name: 'BusImg',
		components: {
			LyTree
		},
		data() {
			return {
				isActive: false,
				ready:false,
				data: [],
				//。。。。。。。。。。。。。。。。。。。。。
				//....................................ffff....
				//0000000000000000000000000000000dd000ff0000000000dddddddddddd0
				PageCur: '',
				// 视频播放
				playerOptions: {
					playbackRates: [0.5, 1.0, 1.5, 2.0], //可选择的播放速度
					autoplay: false, //如果true,浏览器准备好时开始回放。
					muted: false, // 默认情况下将会消除任何音频。
					loop: false, // 视频一结束就重新开始。
					preload: 'auto', // 建议浏览器在<video>加载元素后是否应该开始下载视频数据。auto浏览器选择最佳行为,立即开始加载视频（如果浏览器支持）
					language: 'zh-CN',
					aspectRatio: '16:9', // 将播放器置于流畅模式，并在计算播放器的动态大小时使用该值。值应该代表一个比例 - 用冒号分隔的两个数字（例如"16:9"或"4:3"）
					fluid: true, // 当true时，Video.js player将拥有流体大小。换句话说，它将按比例缩放以适应其容器。
					sources: [{
						type: "",
						src: '../../../static/video/g.mp4' ,//url地址
						/* ../../../static/video/m.mp4 */
					}],
					poster: "", //你的封面地址
					// width: document.documentElement.clientWidth,
					notSupportedMessage: '此视频暂无法播放，请稍后再试', //允许覆盖Video.js无法播放媒体源时显示的默认信息。
					controlBar: {
						timeDivider: true, //当前时间和持续时间的分隔符
						durationDisplay: true, //显示持续时间
						remainingTimeDisplay: false, //是否显示剩余时间功能
						fullscreenToggle: true //全屏按钮
					}
				},

			}
		},
		onLoad(options) {
			console.log(options);
			
			uni.request({
				url: this.apiServier + '/toPlayPage',
				method: 'get',
				header: {
					'content-type': "application/x-www-form-urlencoded"
				},
				data: {
					gname: options.titles
				},
				success: (res) => {
					console.log(res);
					this.data = res.data
					this.ready = true;
				}
			});
			
		},
		
		methods: {
			// uni-app中emit触发的方法只能接受一个参数，所以会回传一个对象，打印对象即可见到其中的内容
			handleNodeClick(obj) {
				if(obj.isLeaf){
				this.playerOptions.sources[0].src=obj.data.videosrc;
				}
			},
			handleNodeExpand(obj) {
				// console.log('handleNodeExpand', JSON.stringify(obj));
			},
			
		
			
		}
	}
</script>

<style>
	.input_video {
		margin: 0 auto;
	}

	.content {
		margin-top: 5px;
		padding-top: 5px;
		padding-bottom: 5px;
		padding-left: 40px;
	}

	.con {
		margin-left: 20px;
	}

	.vbooks {
		margin: 15px;
	}
</style>
