<template>
	<div class="container">
		<uni-view class="cu-bar bg-white solid-bottom margin-top" @click="isActive = !isActive">
			<uni-view class="action">
				<uni-text class="cuIcon-title ">
					<span>菜单列表</span>
				</uni-text>
			</uni-view>
		</uni-view>
		<collapse>
			<div class="container" v-show="isActive">

				<uni-view class="cu-item bg-white">
					<uni-view class="content">
						<uni-text class="text-grey">
							<span>图标 + 标题2</span>
						</uni-text>
					</uni-view>
				</uni-view>
			</div>

		</collapse>
	</div>
</template>
<script>
	import collapse from "../../common/collapse.js";
	export default {
		data() {
			return {
				isActive: false
			};
		},
		components: {
			collapse
		}
	};
</script>
<style>
	
</style>