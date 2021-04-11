import Vue from "vue";
import VueRouter from "vue-router";
import Find from "@/views/Find.vue";
import Home from "@/views/Home.vue";
import Notice from "@/views/Notice.vue";
import FAQ from "@/views/FAQ.vue";
import Info from "@/views/Info.vue";
import Main from "@/views/Main.vue";
import MakeRoom from "@/views/MakeRoom.vue";
import IntoRoom from "@/views/IntoRoom.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },

  {
    path: "/find",
    name: "Find",
    component: Find,
  },
  {
    path: "/notice",
    name: "Notice",
    component: Notice,
  },
  {
    path: "/faq",
    name: "FAQ",
    component: FAQ,
  },
  {
    path: "/info",
    name: "Info",
    component: Info,
  },
  {
    path: "/main",
    name: "Main",
    component: Main,
  },
  {
    path: "/makeroom",
    name: "MakeRoom",
    component: MakeRoom,
  },
  {
    path: "/intoroom/:session_id",
    name: "IntoRoom",
    component: IntoRoom,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
