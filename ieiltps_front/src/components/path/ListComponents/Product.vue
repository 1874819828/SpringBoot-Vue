<template>
  <div class="Sort">
    <div v-for="cow in 4" :key="cow">
      <!-- 第{{ cow }}行 -->
      <div>
        <el-row :gutter="20">
          <el-col :span="6" v-for="col in 4" :key="col"
            ><div v-if="(cow - 1) * 4 + col <= dataList.length">
              <el-card
                shadow="hover"
                style="background-color: rgba(255, 105, 180, 0.6)"
              >
                <h3 style="text-align: center; margin: 0">
                  {{ (cow - 1) * 4 + col }}.jpg
                </h3>
                <el-image
                  class="conImg"
                  :src="
                    require('@/static/img/' + ((cow - 1) * 4 + col) + '.jpg')
                  "
                ></el-image>
                <div class="Center">
                  <p>${{ (cow - 1) * 4 + col }}4853/月</p>
                  <el-tag type="danger">待租</el-tag>
                  <div style="flex: 1"></div>
                  <p style="text-align: right">南京{{ (cow - 1) * 4 + col }}</p>
                </div>
                <div class="Center" style="height: 25px">
                  <p style="font-size: 120%">需求{{ (cow - 1) * 4 + col }}台</p>
                  <el-link
                    style="font-size: 120%"
                    type="danger"
                    :underline="false"
                    >{{ (cow - 1) * 4 + col }}装备</el-link
                  >
                </div>
              </el-card>
            </div></el-col
          >
        </el-row>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      dataList: {
        length: 16,
      },
    };
  },
  mounted() {
    // console.log('cow来了'+cow);
  },
  created() {},
  computed: {},
  methods: {},
};
</script>
<style scoped>
.Sort {
  display: flex;
  flex-direction: column;
  flex-wrap: wrap;
  /* background-color: aqua; */
}
.Sort > div {
  /* margin: 3px; */
  /* background-color: aqua; */
  border: 1px solid #954275;
  /* height: 100px; */
  /* width: 100px; */
}
.el-row {
  margin-bottom: 20px;
}
.el-col {
  border-radius: 4px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
.conImg {
  height: 280px;
  width: 100%;
}
.Center {
  display: flex;
  align-items: center;
  /* justify-content: center; */
}
</style>